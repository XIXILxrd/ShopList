package com.example.shoplist.domain

class GetShopItemListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItemList(): List<ShopItem> {
        return shopListRepository.getShopItemList()
    }
}