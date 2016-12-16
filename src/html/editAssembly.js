$(document).ready(function () {
    alert("hello!");
});


function fillAssembliesByName(name) {

}

function fillPartsByName(name) {
    // clear dropdown and add not selected item
    $.ajax({url: "/getPartsByName?name=" + name,
        success: function(result){
            $(jQuery.parseJSON(JSON.stringify(result))).each(function() {
                console.log("name:" + this.name);
                console.log("id:" + this.id);
                /*$("#material").append("<option value='" + this.id + "'>" + this.name + " " + this.dimensions +  "</option>");*/
            });
        }});
}

function fillStandardPartsByName(name) {

}

function fillMaterialsByName(name) {

}

function addAssembly() {
    return false;
}

function addPart() {
    return false;
}

function addStandardPart() {
    return false;
}

function addMaterial() {
    return false;
}


