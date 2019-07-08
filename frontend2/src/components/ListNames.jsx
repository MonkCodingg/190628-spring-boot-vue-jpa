import React from 'react'

const ListNames = (props)=>{
    const items = props.data.map(   // map은 loop 함수
        (i, v) => { // index, value
            return <li>{v}</li>
        }
    )
    return (
        <ul>
            {items}
        </ul>
    )
}

export default ListNames;