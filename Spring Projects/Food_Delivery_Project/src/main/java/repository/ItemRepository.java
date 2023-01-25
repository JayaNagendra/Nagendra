package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Cart;

public interface ItemRepository extends JpaRepository<Cart, Integer>{

}
