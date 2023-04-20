package com.example.shoplist.domain

interface ShopListRepository {

    fun getShopItem(shopItemId: Int): ShopItem

    fun deleteShopItem(shopItem: ShopItem)

    fun addShopItem(shopItem: ShopItem)

    fun getShopItemList(): List<ShopItem>

    fun editShopItem(shopItem: ShopItem)
}