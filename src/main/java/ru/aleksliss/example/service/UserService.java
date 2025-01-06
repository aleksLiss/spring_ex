package ru.aleksliss.example.service;

import ru.aleksliss.example.database.repository.CompanyRepository;
import ru.aleksliss.example.database.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;
    private final CompService compService;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository, CompService compService) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
        this.compService = compService;
    }


}
