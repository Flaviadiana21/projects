import React, {Component} from "react";
import * as axios from 'axios';
import {AddBirthday} from "./AddBirthday";
import {EditBirthday} from "./EditBirthday";
import {Button} from 'react-bootstrap'

export class Birthdays extends Component{

    constructor(props) {
        super(props);

        this.state ={
            birthdays: []
        }

        this.addBirthday = this.addBirthday.bind(this)
        this.editBirthday = this.editBirthday.bind(this)
        this.deleteBirthday = this.deleteBirthday.bind(this)


    }

    componentDidMount() {
        this.populateTable()
    }

    async populateTable(){
        // const, var, let
        let response = await axios.get("http://localhost:8080/api/birthdays")

        console.log(response)

        let data = response.data

        this.setState({birthdays: data})

    }

    async addBirthday(personName, personDay) {
        let birthday = {"id": 0, "name": personName, "day": personDay}

        let newBirthdays = this.state.birthdays
        newBirthdays.push(birthday)
        this.setState({birthdays: newBirthdays})

        let response = await axios.post('http://localhost:8080/api/birthdays', birthday)

        console.log(response)

        let correctBirthday = {"id": response.data.id, "name": personName, "day": personDay}
        let newCorrectBirthdays = this.state.birthdays
        newCorrectBirthdays.pop()
        newCorrectBirthdays.push(correctBirthday)

        this.setState({birthdays: newCorrectBirthdays})
    }

    async editBirthday(birthday, personName, personDay) {

        let newBirthdays = this.state.birthdays
        newBirthdays = newBirthdays.map(b => {
                if (b.id === birthday.id) {
                    b.name = personName
                    b.day = personDay
                }
                return b;

            }
        )

        this.setState({birthdays: newBirthdays})

        let requestText = 'http://localhost:8080/api/birthdays/' + birthday.id

        let body = {"id": birthday.id, "name": personName, "day": personDay}

        let response = await axios.put(requestText, body)

        console.log(response)
    }


    async deleteBirthday(birthday){

        let newBirthdays = this.state.birthdays

        newBirthdays = newBirthdays.filter(b => b.id !== birthday.id )

        this.setState({birthdays: newBirthdays})

        let requestText = 'http://localhost:8080/api/birthdays/' + birthday.id

        let response = await axios.delete(requestText)

        console.log(response)

    }

    render() {

        return(
            <div>
                <AddBirthday addBirthday={this.addBirthday}/>
                <table className='table table-striped' aria-labelledby="tableLabel">
                    <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Day</th>
                    </tr>

                    </thead>


                    <tbody>

                    {
                        this.state.birthdays.map((birthday, index) =>
                            <tr key={birthday.id}>
                                <td>{index}</td>
                                <td>{birthday.name}</td>
                                <td>{birthday.day}</td>
                                <td style={{width: '4rem'}}>
                                    <EditBirthday editBirthday={this.editBirthday} currentBirthday={birthday}/>
                                </td>
                                <td style={{width: '4rem'}}>
                                    <Button onClick={() => this.deleteBirthday(birthday)} className='btn btn-danger'>Delete</Button>
                                </td>


                            </tr>



                        )


                    }


                    </tbody>

                </table>



            </div>
        );

    }


}