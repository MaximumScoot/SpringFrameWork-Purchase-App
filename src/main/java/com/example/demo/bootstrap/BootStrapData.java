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
            OutsourcedPart FluxCap = new OutsourcedPart();
            FluxCap.setName("Flux Capacitor");
            FluxCap.setInv(5);
            FluxCap.setPrice(2000.0);
            FluxCap.setId(1);
            outsourcedPartRepository.save(FluxCap);

            OutsourcedPart LazeCannon = new OutsourcedPart();
            LazeCannon.setName("Lazer Cannon");
            LazeCannon.setInv(10);
            LazeCannon.setPrice(500.0);
            LazeCannon.setId(2);
            outsourcedPartRepository.save(LazeCannon);

            InhousePart PlasmaDrive = new InhousePart();
            PlasmaDrive.setName("Plasma Drive");
            PlasmaDrive.setInv(50);
            PlasmaDrive.setPrice(250.0);
            PlasmaDrive.setId(3);
            inhousePartRepository.save(PlasmaDrive);

            InhousePart PartBeam = new InhousePart();
            PartBeam.setName("Particle Beam");
            PartBeam.setInv(3);
            PartBeam.setPrice(8000.0);
            PartBeam.setId(4);
            inhousePartRepository.save(PartBeam);

            InhousePart PlasmaPistol = new InhousePart();
            PlasmaPistol.setName("Plasma Pistol");
            PlasmaPistol.setInv(200);
            PlasmaPistol.setPrice(150.0);
            PlasmaPistol.setId(5);
            inhousePartRepository.save(PlasmaPistol);

        }
        //Condition so products don't duplicate when re-running the program
        if (productRepository.count() == 0) {
            //Instantiating 5 sample inventory products, setting values and saving to parts repo
            Product FluxBolts = new Product(6,"Flux Capacitor Bolts", 2.99, 400);
            productRepository.save(FluxBolts);

            Product CannonBarrel = new Product(7,"Lazer Cannon Barrel", 20.99, 200);
            productRepository.save(CannonBarrel);

            Product PlasmaRefill = new Product(8,"Plasma Drive Refill", 4.99, 500);
            productRepository.save(PlasmaRefill);

            Product ParticleRefill = new Product(9,"Particle Beam Refill", 24.99, 300);
            productRepository.save(ParticleRefill);

            Product PlasmaMag = new Product(10,"Plasma Magazine", 5.99, 1000);
            productRepository.save(PlasmaMag);
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
