import React, {Component} from 'react'

 class Timer extends Component{
     constructor(){
         super()
         this.state = {
            seconds: 0 
         }
     }
     tick(){
         this.setState(state=>({
             seconds: state.seconds + 1
         }))
     }

     componentDidMount(){
        // 내장된 프로퍼티 
        this.interval = setInterval(()=> this.tick(), 1000)
     }
     componentWillUnmount(){
         clearInterval(this.interval)
     }

     render(){
        return(
            <div>
                Seconds: {this.state.seconds}
            </div>
        )

     }
 }
 export default Timer