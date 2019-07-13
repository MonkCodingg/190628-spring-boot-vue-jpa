import React, {Component}  from 'react';
import {Form, Button} from 'react-bootstrap'
import axios from 'axios'
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
                <form onSubmit="{this.login}">
                    <Form>
                        <Form.Group controlId="customerId">
                            <Form.Label>Customer ID</Form.Label>
                            
                            <input 
                                type="text"
                                name='customerId'
                                onChange={this.idChange}
                            />
                        </Form.Group>
                        <Form.Group controlId="password">
                            <Form.Label>PASSWORD</Form.Label>
                            
                            <input 
                                type="text"
                                name='password'
                                onChange={this.pwChange}
                            />
                        </Form.Group>
                    </Form>
                    <Button variant="success" onClick={this.login}>전 송</Button>
                    <Button variant="warning">취 소</Button>            
                </form>
            </div>
        );
    }
    idChange = e =>{
        this.setState({customerId: e.target.value})
    }
    pwChange = e =>{
        this.setState({password: e.target.value})
    }
    login = e =>{
        alert('로그인 버튼 클릭')
        e.preventDefault();
//        this.setState({submitted: true})
        const { customerId, password } = this.state
//        console.log(` customerId is ${customerId}`)
//        console.log(` password is ${password}`)
        const data = {
            customerId: this.state.customerId,
            password: this.state.password
        }
        const headers = {
            /* customerId: this.state.customerId,
            password: this.state.password */
            'Content-Type': 'application/json',
            'Autorization': 'JWT fefege..'
        }
        alert('로그인 버튼 클릭 !! id: ' +data.cutomerId+ ', pass: '+ data.password)
        axios.post(`http://localhost:9000/customers/login`,
                    JSON.stringfy(data),
                    {headers: headers})
        .then(res =>{
            alert(`login 성공`)
        })
        .catch(e=>{
            alert(`login 실패`);
        })
    }  
}
export default Login;