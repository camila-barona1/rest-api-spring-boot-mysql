package com.thinkconstructive.restdemo.service;

import com.thinkconstructive.restdemo.model.Vendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(Vendor cloudVendor);
    public String updateCloudVendor(Vendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public Vendor getCloudVendor(String cloudVendorId);
    public List<Vendor> getAllCloudVendors();
    public List<Vendor> getByVendorName(String vendorName);
}
