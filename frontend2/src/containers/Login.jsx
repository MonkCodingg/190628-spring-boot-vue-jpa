import React, {Component}  from 'react';
import {Form, Button} from 'react-bootstrap'

class Login extends Component{
    constructor(props){
        super(props);//props는 반드시 부모한테 받는다.
        this.state = {
            customerId: '',
            password: '',

        }
    }

    render(){
        return(
            <div>
                <form onSubmit="{this.handleSubmit}">
                
                    <Form.Group controlId="customerId">
                        <Form.Label>Customer ID</Form.Label>
                        <Form.Control type="text" placeholder="Customer id" />
                        
                    </Form.Group>
                    <Form.Group controlId="password">
                        <Form.Label>Password</Form.Label>
                        <Form.Control type="password" placeholder="Password" />
                    </Form.Group>
                    
                    <Button variant="success">전 송</Button>
                    <Button variant="warning">취 소</Button>
            
                </form>
            </div>
    
        )
    }  
}

export default Login;