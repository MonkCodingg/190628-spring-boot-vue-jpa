import React, {Component} from 'react';
import {Table} from 'react-bootstrap';
import Image from 'react-bootstrap/Image'
import Kakao from '../assets/images/kakao.jpg';
class MyPage extends Component{
    constructor(props){
        super(props);
        this.state = {
        }
    }
    render(){
        return(
            <div>
                <Table striped bordered hover variant="dark">
                    
                    <tbody>
                        <tr>
                        <td rowSpan='4' colSpan='2'>
                        <Image src={Kakao} style={{width: 250,height: 180}} roundedCircle />
                        </td>
                        <td>customerId</td>
                        <td>hong</td>
                        </tr>
                        <tr>
                        <td>customerName</td>
                        <td>홍길동</td>
                        
                        </tr>

                        <tr>
                        <td>phone</td>
                        <td >010-1111-2222</td>
                        
                        </tr>

                        <tr>
                        <td>주 소(도시)</td>
                        <td>서울특별시 종로구</td>
                        
                        </tr>

                    </tbody>
                </Table>
            </div>
        )
    }
}

export default MyPage;