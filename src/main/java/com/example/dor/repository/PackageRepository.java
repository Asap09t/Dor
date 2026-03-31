package com.example.dor.repository;

import com.example.dor.entity.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface PackageRepository extends JpaRepository<Package, Long> {
    Optional<Package> findByTrackingNumber(String trackingNumber);
    List<Package> findByStatus(String status);
    List<Package> findByRecipientName(String recipientName);
}