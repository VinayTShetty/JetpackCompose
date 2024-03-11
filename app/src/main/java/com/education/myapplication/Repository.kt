package com.education.myapplication


class Repository {
    val list= mutableListOf<Categotry>()
    fun getListItems():MutableList<Categotry>{
        list.add(Categotry(R.drawable.baseline_adb_24,"ADB","Android Debugging Tool"))
        list.add(Categotry(R.drawable.baseline_add_shopping_cart_24,"Shopping Cart","Shopping Item Descpirtion"))
        list.add(Categotry(R.drawable.baseline_add_location_24,"Location","Address of the User"))
        list.add(Categotry(R.drawable.baseline_android_24,"Android","Android Operationg Tool"))
        list.add(Categotry(R.drawable.baseline_attribution_24,"BaseLine","BaseLine Attribution Tool"))
        list.add(Categotry(R.drawable.baseline_adb_24,"ADB","Android Debugging Tool"))
        list.add(Categotry(R.drawable.baseline_add_shopping_cart_24,"Shopping Cart","Shopping Item Descpirtion"))
        list.add(Categotry(R.drawable.baseline_add_location_24,"Location","Address of the User"))
        list.add(Categotry(R.drawable.baseline_android_24,"Android","Android Operationg Tool"))
        list.add(Categotry(R.drawable.baseline_attribution_24,"BaseLine","BaseLine Attribution Tool"))
        return  list
    }
}