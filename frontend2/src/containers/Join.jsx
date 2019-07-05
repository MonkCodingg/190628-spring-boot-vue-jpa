import React, {Component} from 'react'
import {Form, Button} from 'react-bootstrap'

class Join extends Component{
    constructor(props){
        super(props);
        this.state = {
            customerId: '',
            password: '',
            customerName: '',
            phone: '',
            city: ''

        }
        
    }

    render(){
        return (
            <div>
            <form>
                <Form.Group controlId="customerId">
                    <Form.Label>Customer ID</Form.Label>
                    <Form.Control type="text" placeholder="Customer id" />
                    
                </Form.Group>
                <Form.Group controlId="password">
                    <Form.Label>Password</Form.Label>
                    <Form.Control type="password" placeholder="Password" />
                </Form.Group>
                <Form.Group controlId="customerName">
                    <Form.Label>Customer Name</Form.Label>
                    <Form.Control type="text" placeholder="customer Name" />
                </Form.Group>
                <Form.Group controlId="phone">
                    <Form.Label>Password</Form.Label>
                    <Form.Control type="text" placeholder="phone" />
                </Form.Group>
                <Form.Group controlId="city">
                    <Form.Label>City</Form.Label>
                    <Form.Control type="text" placeholder="city" />
                </Form.Group>

                <Button variant="success">전 송</Button>
                <Button variant="warning">취 소</Button>
            </form>
            
            </div>
        )
    }
}
export default Join;