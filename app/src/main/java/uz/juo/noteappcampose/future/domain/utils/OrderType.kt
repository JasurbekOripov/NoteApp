package uz.juo.noteappcampose.future.domain.utils

sealed class OrderType{
    object  Ascending:OrderType()
    object  Descending:OrderType()
}
