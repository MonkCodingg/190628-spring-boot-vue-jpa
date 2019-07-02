<template>
<div>
  <Nav></Nav>
  <form>
    <div class="form-group">
      <label for="email">ID:</label>
      
      <input type="text" class="form-control" id="id" placeholder="Enter id" v-model="customerId">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" v-model="password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Recommon me</label>
    </div>
    <button class="btn btn-default" @click="login">로그인</button>
    <button class="btn btn-default" @click="count">count</button>
    <button class="btn btn-default" @click="existsById">existsById</button>
    <button class="btn btn-default" @click="findAll">findAll</button>
    <button class="btn btn-default" @click="findById">findById</button>
    <button class="btn btn-default" @click="save">save</button>
    <button class="btn btn-default" @click="deleteById">deleteById</button>
  </form>
  <Footer></Footer>
</div>
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'
import axios from 'axios'
export default {
  data: ()=>{ // data 안 값 접근은 this로.
    return {
      context: 'http://localhost:9000/customers',
      customerId: 'hong',
      customerName: '홍길동',
      password: '1234', 
      ssn: '790888-2', 
      phone: '010-1111-2222', 
      city: '서울 강북', 
      address: 'ymca', 
      postalcode: '960-5', 
      photo: 'hong.jpg'
    }
  },
  components: {
    Nav,
    Footer
  },
  // es5 방식
  // methods: {
  //   submit: function(){
  //     alert('되냐?')
  //   }  
  // }
  // es6 방식
  methods: {
    count(){
      axios.get(`${this.context}/count`)
      .then(res=>{
          alert(`SUCCESS: ${res.data}`)
      })
      .catch(e=>{
          alert('ERROR')
      })
    },
    deleteById(){
      alert("deleteById 함수 실행");
      axios.delete(`${this.context}/1`)
      .then(res=>{
          alert(`SUCCESS: ${res.data}`)
      })
      .catch(e=>{
          alert('ERROR')
      })
    },
    existsById(){
      axios.get(`${this.context}/exists/1`)
      .then(res=>{
          alert(`SUCCESS: ${res.data}`)
      })
      .catch(e=>{
          alert('ERROR')
      })
    },
    findAll(){
      axios.get(`${this.context}`)
      .then(res=>{
          alert(`SUCCESS: ${res.data.list[0].customer}`)
      })
      .catch(e=>{
          alert('ERROR')
      })
    },
    findById(){
      axios.get(`${this.context}/1`)
      .then(res=>{
          alert(`findByIdSUCCESS: ${res.data.customerName}`)
      })
      .catch(e=>{
          alert('ERROR')
      })
    },
    save(){
      let data = {
        id: 40,
        customerId: this.customerId,
        customerName: this.customerName,
        password: this.password,
        ssn: this.ssn,
        phone: this.phone,
        city: this.city,
        address: this.address,
        postalcode: this.postalcode,
        photo: this.photo

      }
      let headers = {
        'Content-Type': 'application/json',
        'Authorization': 'JWT fefege..'
      }
      axios.post(`${this.context}`, 
                JSON.stringify(data),
                {headers: headers})
      .then(res=>{
          alert(`SUCCESS2 : ${res.data}`)
      })
      .catch(e=>{
          alert('ERROR')
      })
    },
    login(){
      alert("login 함수")
      let data = {
        customerId: this.customerId,
        password: this.password
      }
      let headers = {
        'Content-Type': 'application/json',
        'Authorization': 'JWT fefege..'
      }
      axios.post(`${this.context}/login`, 
                JSON.stringify(data),
                {headers: headers})
      .then(res=>{
          alert(`SUCCESS2 : ${res.data.customerId}`)
      })
      .catch(e=>{
          alert('ERROR')
      })
    }
    
    
  }
}
</script>

<style scoped>
</style>