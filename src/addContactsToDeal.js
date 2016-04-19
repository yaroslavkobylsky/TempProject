function addDealButton(){

    contactId = document.getElementById("contact").value;
    console.log("contact id: " + contactId);
    contactName = document.getElementById("contact").innerHTML;
    console.log("contact name:" + contactName );

    contactList = document.getElementById("contactsList");

    newListItem = document. createElement("li");
    newListItem.innerHTML = contactName;

    newInput = document.createElement("input");
    newInput.setAttribute("type", "text");
    newInput.setAttribute("value", contactId);
    newInput.setAttribute("id", contactId);
    newInput.setAttribute("class", contactId);

    deleteButton = document.createElement("input");
    deleteButton.setAttribute("type", "submit");
    deleteButton.setAttribute("id", contactId);
    deleteButton.setAttribute("class", contactId);




    return false;
}

function deleteContactFromList(id){

    return false;
}
