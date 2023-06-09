package org.delivery;

import org.delivery.Repository.CustomerRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CourierRepositoryIntegrationTest {

    @Autowired
    private CustomerRepository customerRepository;
}
