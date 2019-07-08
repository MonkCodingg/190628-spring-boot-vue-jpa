import React from 'react'
import {Nav,NavDropdown,Navbar} from 'react-bootstrap';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";

import Login from "../containers/Login.jsx"
import Join from "../containers/Join.jsx"
import MyPage from "../containers/MyPage.jsx"
import Home from "../containers/Home.jsx"
import Hello from "../containers/customer/Hello.jsx"
import LightSwitch from "../containers/customer/LightSwitch.jsx"
import Timer from "../containers/common/Timer.jsx"
import TodoApp from "../containers/common/TodoApp.jsx"
import Clock from "../containers/common/Clock.jsx"

const MyNav = () => {
    return (
        <Router>
        <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
            <Navbar.Brand href="#home">React-Bootstrap</Navbar.Brand>
            <Navbar.Toggle aria-controls="responsive-navbar-nav" />
            <Navbar.Collapse id="responsive-navbar-nav">
                <Nav className="mr-auto">
                    <Nav.Link href="#features">Home</Nav.Link>
                    <Nav.Link href="#pricing">스케줄러</Nav.Link>
                    <Nav.Link href="/hello">Hello</Nav.Link>
                    <Nav.Link href="/lightSwitch">LightSwitch</Nav.Link>
                    <Nav.Link href="/timer">Timer</Nav.Link>
                    <Nav.Link href="/todo">TodoList</Nav.Link>
                    <Nav.Link href="/clock">clock</Nav.Link>
                    <NavDropdown title="회원관리" id="collasible-nav-dropdown">
                        
                        <NavDropdown.Item>
                            <Link to='/join'>회원가입</Link>
                        </NavDropdown.Item>
                    
                        <NavDropdown.Item>
                        <Link to='/Login'>로그인</Link>
                        </NavDropdown.Item>
                    
                        <NavDropdown.Item>
                        <Link to='/MyPage'>마이페이지</Link>
                        </NavDropdown.Item>
                        
                        <NavDropdown.Divider />
                        
                        <NavDropdown.Item>
                        <Link to=''>회원탈퇴</Link>
                        </NavDropdown.Item>
                        
                    </NavDropdown>
                </Nav>
                <Nav>
                    <Nav.Link href="#deets">More deets</Nav.Link>
                    <Nav.Link eventKey={2} href="#memes">
                        Dank memes
                    </Nav.Link>
                </Nav>
            </Navbar.Collapse>
        </Navbar>
        <Route path='/login' component={Login}/>
        <Route path='/join' component={Join}/>
        <Route path='/mypage' component={MyPage}/>
        <Route path='/home' component={Home}/>
        <Route path='/hello' component={Hello}/>
        <Route path='/lightSwitch' component={LightSwitch}/>
        <Route path='/timer' component={Timer}/>
        <Route path='/todo' component={TodoApp}/>
        <Route path='/clock' component={Clock}/>

        
    </Router>
    )

}

export default MyNav