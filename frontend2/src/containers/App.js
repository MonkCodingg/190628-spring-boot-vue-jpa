import React from 'react';

import './App.css';
import MyFooter from './MyFooter';
import Hello from './Hello';
import MyNav from './MyNav';
function App() {
  return (
    <div className="App">
      <MyNav></MyNav>
      <Hello name="wonjungho"></Hello>
      <MyFooter></MyFooter>
    </div>
  );
}

export default App;
