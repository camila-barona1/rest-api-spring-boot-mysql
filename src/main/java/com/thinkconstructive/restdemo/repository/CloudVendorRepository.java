package com.thinkconstructive.restdemo.repository;

import com.thinkconstructive.restdemo.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<Vendor, String> {
    List<Vendor> findByVendorName(String vendorName);
}
