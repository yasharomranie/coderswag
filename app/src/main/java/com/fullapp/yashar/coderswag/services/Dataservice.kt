package com.fullapp.yashar.coderswag.services

import com.fullapp.yashar.coderswag.model.Category
import com.fullapp.yashar.coderswag.model.Product

object Dataservice {
    val category = listOf(
      Category("پیراهن","shirtimage"),
      Category("پیراهن کلاهدار","hoodieimage"),
      Category("کلاه","hatimage"),
      Category("دیجیتال","digitalgoodsimage"),
       Category("پیراهن","shirtimage"),
      Category("پیراهن کلاهدار","hoodieimage"),
      Category("کلاه","hatimage"),
      Category("دیجیتال","digitalgoodsimage"),
      Category("پیراهن","shirtimage"),
      Category("پیراهن کلاهدار","hoodieimage"),
      Category("کلاه","hatimage"),
      Category("دیجیتال","digitalgoodsimage")


    )

    val hats= listOf(
            Product("کلاه دو اسلوپ گرفیکی","$1000","hat1"),
            Product("کلاه مشکی","$25","hat2"),
            Product("کلاه سفید","$23","hat3"),
            Product("کلاه","$22","hat4")
    )

    val hoodies = listOf(
            Product("پیراهن کلاهدار خاکستری","$5000","hoodie1"),
            Product("پیراهن کلاهدار قرمز","$2500","hoodie2"),
            Product("پیراهن کلاهدار خاکستری مارک دار","$5000","hoodie3"),
            Product("پیراهن کلاهدار سیاه","$5000","hoodie4")


    )
    val shirts = listOf(
            Product("پیراهن مشکی  ","$35000","shirt1"),
            Product("پیراهن کلاهدار قرمز","$2500","shirt2"),
            Product("پیراهن  خاکستری مارک دار","$32","shirt3"),
            Product("پیراهن  سیاه","$22","shirt4"),
            Product("پیراهن استادیو کیک فلیپ ","$35","shirt5")



    )
    val digitalgood= listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category) {
            "پیراهن"-> shirts
            "کلاه"-> hats
            "پیراهن کلاهدار"-> hoodies
            else-> digitalgood
        }
    }

}