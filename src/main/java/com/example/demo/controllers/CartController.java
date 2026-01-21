package com.example.demo.controllers;

import com.example.demo.dto.AddToCartRequest;
import com.example.demo.models.Cart_Item;
import com.example.demo.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for managing shopping cart operations.
 * Handles adding items to cart and retrieving cart contents.
 */
@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * Adds a product to the user's shopping cart.
     * @param request Contains userId, productId, and quantity.
     * @return The added cart item.
     */
    @PostMapping("/add")
    public ResponseEntity<Cart_Item> addToCart(@RequestBody AddToCartRequest request) {
        Cart_Item cartItem = cartService.addToCart(request);
        return ResponseEntity.ok(cartItem);
    }

    /**
     * Retrieves all items in the shopping cart.
     * Note: In a real application, this should be filtered by user.
     * @return List of cart items.
     */
    @GetMapping
    public ResponseEntity<List<Cart_Item>> getCart() {
        List<Cart_Item> cartItems = cartService.getCartItems();
        return ResponseEntity.ok(cartItems);
    }

    /**
     * Clears all items from the shopping cart.
     * @return Success message.
     */
    @DeleteMapping("/clear")
    public String clearCart() {
        return cartService.clearCart();
    }
}
