package com.example.sakshamspc.coderswag.Services

import com.example.sakshamspc.coderswag.Model.Category
import com.example.sakshamspc.coderswag.Model.Product

/**
 * Created by Saksham Srivastava on 7/19/2018.
 */
object DataService {

    val categories= listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HAT","hatimage"),
            Category("DIGITAL","digitalgoodsimage")

    )
    val hat= listOf(
            Product("Nike Hat Black","Rs.899","hat1"),
            Product("Reebok Hat Blue","Rs.1299","hat2"),
            Product("Puma Hat Red","Rs.1159","hat3"),
            Product("Puma Sportz Edition","Rs.1400","hat4")
    )
    val hoodie=listOf(
            Product("Nike Hoodie Black","Rs.1499","hoodie1"),
            Product("Reebok Hoodie Blue","Rs.1600","hoodie2"),
            Product("Puma Hoodie Red","Rs.1350","hoodie3"),
            Product("Wrogn Hoodies ","Rs.1690","hoodie4")
    )
    val shirts=listOf(
            Product("Nike Shirt Black","Rs.1299","shirt1"),
            Product("Reebok Shirt Striped","Rs.1400","shirt2"),
            Product("Puma Shirt Sports","Rs.1450","shirt3"),
            Product("Wrogn Shirt Formals ","Rs.1290","shirt4"),
            Product("Van Heusen Formals ","Rs.3290","shirt5")
    )
}