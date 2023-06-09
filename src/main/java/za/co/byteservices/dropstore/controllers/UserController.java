//package za.co.byteservices.dropstore.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import za.co.byteservices.dropstore.models.Profile;
//import za.co.byteservices.dropstore.models.User;
//import za.co.byteservices.dropstore.repositories.ProfileRepository;
//import za.co.byteservices.dropstore.repositories.UserRepository;
//
//@Controller
//@RequestMapping("/users")
//public class UserController {
//    private final UserRepository userRepository;
//    private final ProfileRepository profileRepository;
//
//    public UserController(UserRepository userRepository, ProfileRepository profileRepository) {
//        this.userRepository = userRepository;
//        this.profileRepository = profileRepository;
//
//    }
//
//    @PostMapping("/register")
//    public String registerUser(@ModelAttribute("user") User user, @ModelAttribute("profile") Profile profile) {
//        // Save the user to the database
//        userRepository.save(user);
//
//        // Associate the user with the profile
//        profile.setUser(user);
//
//        // Save the profile to the database
//        profileRepository.save(profile);
//
//        // Redirect to the login page or any other desired page
//        return "redirect:/login";
//    }
//
//    // Other controller methods for login, profile updates, etc.
//    // ...
//}
