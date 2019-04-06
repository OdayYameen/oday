class Controler {


    constructor(model){


        this.model=model;


    }

    setValue(v){
    this.model.SetValue(document.getElementById("txtbox"),v);

    }
    ClearTxt(){

        this.model.Clear(document.getElementById("txtbox"));

    }

    ToCalc(){
        this.model.calculate(document.getElementById("txtbox"));
    }


}