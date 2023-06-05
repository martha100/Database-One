package com.example.afternoondatabaseapp
var ref = FirebaseDatabse.getInstant().getReference().child("users/"+item.id)
ref.removable().addOnCompleListener{
    if(it.issuccessful) {
        toast.makeText(context, "user deleted succesfully")
        toast.(LENTH LONG).show()

    }else{
        toast.makeText("user deletion failed")
        toast.(LENTH LONG).show()
    }
}