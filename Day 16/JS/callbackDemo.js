function doHomework(subject,callback){
    // console.log("Finished my " + subject + " homework")
    console.log(`Finished my ${subject} homework`)
    // alertFinished();
    callback();
}

function alertFinished(){
    console.log("Homw work Finished")
}

doHomework("Science", alertFinished)