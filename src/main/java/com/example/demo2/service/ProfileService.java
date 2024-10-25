
package com.example.demo2.service;

import com.example.demo2.model.Profile;
import com.example.demo2.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public Profile updateProfile(Long id, Profile profileDetails) {
        Profile profile = profileRepository.findById(id).orElseThrow(() -> new RuntimeException("Profile not found"));
        profile.setName(profileDetails.getName());
        profile.setTitle(profileDetails.getTitle());
        profile.setEmail(profileDetails.getEmail());
        profile.setPhone(profileDetails.getPhone());
        profile.setUsername(profileDetails.getUsername());
        profile.setPassword(profileDetails.getPassword());
        profile.setResearch(profileDetails.getResearch());

        profile.setAwards(profileDetails.getAwards());
        profile.setLab(profileDetails.getLab());
        profile.setExchange(profileDetails.getExchange());
        profile.setScholarship(profileDetails.getScholarship());
        profile.setGraduates(profileDetails.getGraduates());

        profile.setImage(profileDetails.getImage());
        return profileRepository.save(profile);
    }


}
