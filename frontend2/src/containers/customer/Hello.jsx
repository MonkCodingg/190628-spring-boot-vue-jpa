import React, {Component} from 'react'
import ListNames from '../../components/ListNames'
const listData = ['김유신','강감찬','유관순']

class Hello extends Component{
    constructor(props){
        super(props);
        this.state = {
            name: '홍길동'
        };
    }
    render(){// view 와 관련된 액션만 한다.
       return(
        <div>
            <ListNames data={listData}></ListNames>
            <h1>{this.state.name}</h1>
        </div>
       )
    }
}
export default Hello;

