package com.example.shoplist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun getShopItem(shopItemId: Int): ShopItem

    fun deleteShopItem(shopItem: ShopItem)

    fun addShopItem(shopItem: ShopItem)

    fun getShopItemList(): LiveData<List<ShopItem>>

    fun editShopItem(shopItem: ShopItem)
}