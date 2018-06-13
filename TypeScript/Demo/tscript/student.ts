class Student{
  
    // declare varibale for store data
    var firstname:string;
    var lastname:string;
    var dateofbirth : string;
    var city: string;


    //Create constuctor for getting data when class execute
    constructor(firstname:string,lastname:string,dateofbirth:string,city:string)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.dateofbirth=dateofbirth;
        this.city=city;
        
    }

    //create method for printin data
    printData() : void
    {
        alert(firstname+""+lastname+""+dateofbirth+""+city);
             
    }

}

//crete object for call the class
let stud = new Student("Rayhan","Kasli","1995-08-08","Bilimora");
//call printdata function using stud object
stud.printData();