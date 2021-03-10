import React, {Component} from "react";
import * as axios from 'axios';
import {Modal, Form, FormControl, InputGroup, Button} from 'react-bootstrap';

export class EditBirthday extends Component{

    constructor(props) {
        super(props);

        this.state = {
            show: false,
            newBirthdayName: this.props.currentBirthday.name,
            newBirthdayDay: this.props.currentBirthday.day
        }

        this.handleChangeName = this.handleChangeName.bind(this)
        this.handleChangeDay = this.handleChangeDay.bind(this)
        this.handleShow = this.handleShow.bind(this)
        this.handleClose = this.handleClose.bind(this)
        this.handleSubmit = this.handleSubmit.bind(this)
    }

    handleShow(){
        this.setState({
            show: true
        })
    }

    handleClose(){
        this.setState({
            show: false
        })
    }

    handleChangeName(event){
        this.setState({
            newBirthdayName: event.target.value
        })
    }

    handleChangeDay(event){
        this.setState({
            newBirthdayDay: event.target.value
        })
    }

    handleSubmit(){
        this.props.editBirthday(this.props.currentBirthday, this.state.newBirthdayName, this.state.newBirthdayDay)
    }



    render(){
        return (
            <div>
                <Button onClick={this.handleShow} className='btn btn-warning'>Edit</Button>
                <Modal show={this.state.show} onHide={this.handleClose}>
                    <Modal.Header closeButton>
                        <Modal.Title> Edit Birthday </Modal.Title>
                    </Modal.Header>

                    <Form onSubmit={event => {
                        event.preventDefault()
                        this.handleSubmit()
                    }
                    }>

                        <Modal.Body>

                            <InputGroup>
                                <FormControl placeholder="Name" value={this.state.newBirthdayName} onChange={this.handleChangeName}/>
                            </InputGroup>
                            <InputGroup>
                                <FormControl placeholder="Date" value={this.state.newBirthdayDay} onChange={this.handleChangeDay}/>
                            </InputGroup>

                        </Modal.Body>

                        <Modal.Footer>
                            <Button variant="secondary" onClick={this.handleClose}>Exit</Button>
                            <Button type="submit" variant="primary" onClick={this.handleClose}>Save</Button>

                        </Modal.Footer>

                    </Form>


                </Modal>


            </div>)
    }
}