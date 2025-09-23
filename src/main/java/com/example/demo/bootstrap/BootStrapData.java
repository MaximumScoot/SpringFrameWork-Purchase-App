package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    //adding inhouse part repo
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */

        //Condition so parts don't duplicate when re-running the program
        if (partRepository.count() == 0) {

            //Instantiating 5 sample inventory parts, setting values and saving to parts repo
            OutsourcedPart FluxBolts = new OutsourcedPart();
            FluxBolts.setName("Flux Capacitor Bolts");
            FluxBolts.setInv(400);
            FluxBolts.setPrice(2.99);
            FluxBolts.setId(6);
            outsourcedPartRepository.save(FluxBolts);

            OutsourcedPart CannonBarrel = new OutsourcedPart();
            CannonBarrel.setName("Lazer Cannon Barrel");
            CannonBarrel.setInv(200);
            CannonBarrel.setPrice(20.99);
            CannonBarrel.setId(7);
            outsourcedPartRepository.save(CannonBarrel);

            InhousePart PlasmaRefill = new InhousePart();
            PlasmaRefill.setName("Plasma Drive Refill");
            PlasmaRefill.setInv(500);
            PlasmaRefill.setPrice(4.99);
            PlasmaRefill.setId(8);
            inhousePartRepository.save(PlasmaRefill);

            InhousePart ParticleRefill = new InhousePart();
            ParticleRefill.setName("Particle Beam Refill");
            ParticleRefill.setInv(300);
            ParticleRefill.setPrice(24.99);
            ParticleRefill.setId(9);
            inhousePartRepository.save(ParticleRefill);

            InhousePart PlasmaMag = new InhousePart();
            PlasmaMag.setName("Plasma Magazine");
            PlasmaMag.setInv(1000);
            PlasmaMag.setPrice(5.99);
            PlasmaMag.setId(10);
            inhousePartRepository.save(PlasmaMag);

        }
        //Condition so products don't duplicate when re-running the program
        if (productRepository.count() == 0) {
            //Instantiating 5 sample inventory products, setting values and saving to parts repo
            Product FluxCap = new Product(1,"Flux Capacitor", 2000.0, 5);
            productRepository.save(FluxCap);

            Product LazeCannon = new Product(2,"Lazer Cannon", 500.0, 10);
            productRepository.save(LazeCannon);

            Product PlasmaDrive = new Product(3,"Plasma Drive", 250.0, 50);
            productRepository.save(PlasmaDrive);

            Product PartBeam = new Product(4,"Particle Beam", 8000.0, 3);
            productRepository.save(PartBeam);

            Product PlasmaPistol = new Product(5,"Plasma Pistol", 150.0, 200);
            productRepository.save(PlasmaPistol);
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
