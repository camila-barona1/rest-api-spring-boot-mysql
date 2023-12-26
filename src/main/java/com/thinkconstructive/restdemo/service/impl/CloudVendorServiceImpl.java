package com.thinkconstructive.restdemo.service.impl;

import com.thinkconstructive.restdemo.exception.VendorNotFoundException;
import com.thinkconstructive.restdemo.model.Vendor;
import com.thinkconstructive.restdemo.repository.CloudVendorRepository;
import com.thinkconstructive.restdemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(Vendor cloudVendor) {
        // More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(Vendor cloudVendor) {
        // More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        // More Business Logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public Vendor getCloudVendor(String cloudVendorId) {
        // More Business Logic
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new VendorNotFoundException("Requested Cloud Vendor does not exist");
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<Vendor> getAllCloudVendors() {
        // More Business Logic
        return cloudVendorRepository.findAll();
    }

    @Override
    public List<Vendor> getByVendorName(String vendorName)
    {
        return cloudVendorRepository.findByVendorName(vendorName);
    }
}
