function printError(elemId, errMsg) {
    document.getElementById(elemId).innerHTML = errMsg;
}

function validateForm() {
    // accessing the values from inputs
    var fullname = document.userForm.fullname.value;
    var emailaddress = document.userForm.emailaddress.value;
    var mobilenumber = document.userForm.mobilenumber.value;
    var country = document.userForm.country.value;
    var gender = document.userForm.gender.value;

    // finding out the selected values from group of items in checkboxes
    var hobbies = [];
    var checkboxes = document.getElementsByName("hobbies[]");
    for(let i = 0; i < checkboxes.length; i++) {
        if(checkboxes[i].checked) {
            hobbies.push(checkboxes[i].value);
        }
    }

    // defining the error variables with a default value
    var fullnameErr = emailaddressErr = mobilenumberErr = countryErr = genderErr = true;

    // validate fullname
    if(fullname == "") {
        printError("fullnameErr", "please enter your fullname");
    } else {
        var regex = /^[a-zA-Z\s]+$/;
        if(regex.test(fullname) === false) {
            printError("fullnameErr", "please enter a valid fullname");
        } else {
            printError("fullnameErr", "");
            fullnameErr = false;
        }
    }

    // validate emailaddress
    if(emailaddress == "") {
        printError("emailaddressErr", "please enter your emailaddress");
    } else {
        var regex = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
        if(regex.test(emailaddress) === false) {
            printError("emailaddressErr", "please enter a valid emailaddress");
        } else {
            printError("emailaddressErr", "");
            emailaddressErr = false;
        }
    }

    // validate mobilenumber
    if(mobilenumber == "") {
        printError("mobilenumberErr", "please enter your mobilenumber");
    } else {
        var regex = /^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$/im;
        if(regex.test(mobilenumber) === false) {
            printError("mobilenumberErr", "please enter a valid mobilenumber");
        } else {
            printError("mobilenumberErr", "");
            mobilenumberErr = false;
        }
    }

    // validate country
    if(country == "") {
        printError("countryErr", "please select any country");
    } else {
        printError("countryErr", "");
        countryErr = false;
    }

    // validate gender
    if(gender == "") {
        printError("genderErr", "please select gender");
    } else {
        printError("genderErr", "");
        genderErr = false;
    }

    // prevent the form being submitted if there are any errors
    if((fullnameErr || emailaddressErr || mobilenumberErr || countryErr || genderErr) == true) {
        return false;
    } else {
        var dataPreview = `
            you've have entered the following details: \n 
            fullname: ${fullname} \n 
            emailaddress: ${emailaddress} \n 
            mobilenumber: ${mobilenumber} \n 
            country: ${country} \n 
            gender: ${gender} \n 
        `;

        if(hobbies.length) {
            dataPreview += `
                hobbies: ${hobbies.join(', ')}
            `;
        }

        alert(dataPreview);
    }
}