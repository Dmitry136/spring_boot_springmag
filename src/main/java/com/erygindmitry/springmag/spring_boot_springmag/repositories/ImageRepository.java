package com.erygindmitry.springmag.spring_boot_springmag.repositories;

import com.erygindmitry.springmag.spring_boot_springmag.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository  extends JpaRepository<Image, Long> {

}
