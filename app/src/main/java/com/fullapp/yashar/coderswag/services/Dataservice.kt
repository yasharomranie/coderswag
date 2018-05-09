package com.fullapp.yashar.coderswag.services

import com.fullapp.yashar.coderswag.model.Category
import com.fullapp.yashar.coderswag.model.Product

object Dataservice {
    val category = listOf(
      Category("پیراهن","shirtimage"),
      Category("پیراهن کلاهدار","hoodieimage"),
      Category("کلاه","hatimage"),
      Category("دیجیتال","digitalgoodsimage")


    )

    val hats= listOf(
            Product("کلاه دو اسلوپ گرفیکی","$1000","hat01"),
            Product("کلاه مشکی","$25","hat02"),
            Product("کلاه سفید","$23","hat03"),
            Product("کلاه","$22","hat04")
    )

    val hoodies = listOf(
            Product("پیراهن کلاهدار خاکستری","$5000","hoodie01"),
            Product("پیراهن کلاهدار قرمز","$2500","hoodie02"),
            Product("پیراهن کلاهدار خاکستری مارک دار","$5000","hoodie03"),
            Product("پیراهن کلاهدار سیاه","$5000","hoodie04")


    )
    val shirts = listOf(
            Product("پیراهن مشکی  ","$35000","shirt01"),
            Product("پیراهن کلاهدار قرمز","$2500","shirt02"),
            Product("پیراهن  خاکستری مارک دار","$32","shirt03"),
            Product("پیراهن  سیاه","$22","shirt04"),
            Product("پیراهن استادیو کیک فلیپ ","$35","shirt05 ")



    )

}