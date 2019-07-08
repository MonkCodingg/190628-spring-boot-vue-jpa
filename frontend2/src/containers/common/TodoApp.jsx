import React, {Component} from 'react'
import TodoList from '../../components/TodoList.jsx'

class TodoApp extends Component {
    constructor(props) {
        super(props);
        this.state = { items: [], text: ''};
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
        //핵심은 data를 Component에 전달하는 것.
        //this.handleSubmit 은 this(클래스)의 자식
        //this.handleSubmit.bind(this)은 this의 자식을 this(TodoApp class)와 bind 한다.
    }
    render(){
        return(
            <div>
                <h3>TODO</h3>
                <TodoList items={this.state.items} />
                <form onSubmit={this.handleSubmit}>
                    <label htmlFor="new-todo">
                        What needs to be done?
                    </label>
                    <input 
                        id="new-todo"
                        onChange={this.handleChange}//값이 변하자마자 이벤트발생
                        value={this.state.text}
                    />
                    <button>
                        Add #{this.state.items.length + 1}
                    </button>
                </form>
            </div>
        );
    }
    handleChange(e){    //
        this.setState({ text: e.target.value });
        //this.setState 부모(Component)에게 값 전달 
        //key는 'text' (주소값)
        //값이 변하면 이벤트가 발생하는 타겟의 value를 state 에 전달.
    }
    handleSubmit(e){    
        e.preventDefault();// form 태그 서브밋 막아라.
        if (!this.state.text.length){
            return;// 종료
        }
        const newItem = {
            text: this.state.text,
            id: Date.now()
        };
        this.setState(state => ({
            items: state.items.concat(newItem),
            text: ''
        }));
    }
}

export default TodoApp