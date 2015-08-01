package com.mycompany.profile.core.custom;

import org.broadleafcommerce.profile.core.domain.Customer;

public interface HCCustomer extends Customer {

    public Integer getAverageHeatRatingBought();

    public Integer getNumSaucesBought();

    public void setNumSaucesBought(Integer numSaucesBought);

    public Integer getTotalHeatRating();

    public void setTotalHeatRating(Integer totalHeatRating);
}