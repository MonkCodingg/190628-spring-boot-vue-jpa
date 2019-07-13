import React, {Component} from 'react';
import '../../assets/css/App.css';
import MyNav from '../../components/MyNav.jsx';


class App extends Component{
  constructor(props){
    super(props)
  }
  render(){
    return (
      <div className="App">
        <MyNav></MyNav>
      </div>
    );
  }
    
}

export default App;
