import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)
//스토어 생성
export default new Vuex.Store({
    state :{ //state 는 객체. 'state'못바꾼다 고정됨. 저장소
        count: 0,
        customerId : 'hong'
    },
    mutations:{

    },
    getters: {

    },
    actions: {

    } 
})


