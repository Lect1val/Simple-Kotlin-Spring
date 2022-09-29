package com.example.kotlin.spring.crud.controller

import com.example.kotlin.spring.crud.model.Company
import com.example.kotlin.spring.crud.repository.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/company")
class CompanyController {

    @Autowired
    lateinit var companyRepository: CompanyRepository

    @PostMapping("/saveCompany")
    fun save(@RequestBody company: Company): String {
        companyRepository.save(company)
        return  "Comapany details has been saved"
    }

    @GetMapping("/getAll")
    fun getAllCompany(): List<Company> {
        return companyRepository.findAll()
    }

    @GetMapping("/getCompany/{name}")
    fun getCompany(@PathVariable name: String): Company {
        return companyRepository.findByName(name)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteCompany(@PathVariable id: Int): String {
        companyRepository.deleteById(id)
        return "A Specific record has been deleted"
    }


}