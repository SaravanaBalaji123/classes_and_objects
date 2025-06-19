class Box<T>{
    private T value;
    public void set(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
    // Here, T is used as an abstract template to accept any type of object.
}