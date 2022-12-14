export const sessionStore = Vuex.createStore({

    state () {
        selectedProduct: null;
        items: null;
        currentCustomer: null;
    },

    mutations: {

        selectProduct(state, product) {
            state.selectedProduct = product;
        }, 
        
        signIn(state, customer) {
            state.currentCustomer = customer;
            state.items = new Array();
        }, 
        
        addItem(state, item) {
            state.items.push(item);
        }, 
        
        clearCart(state) {
            state.items = [];
        }
    },

    plugins: [window.createPersistedState({storage: window.sessionStorage})]

});