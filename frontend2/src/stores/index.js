import {createStore} from 'redux';
import todoApp from '..reducers';

let store = crateStore(todoApp)

export default store;