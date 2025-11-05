package app;

import decorators.DndDecorator;
import decorators.TeaserDecorator;
import facade.NewsFacade;
import factory.*;
import observer.Subscriber;
import strategy.*;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        NewsFacade facade = NewsFacade.usingSingletonAgency();
        facade.setDefaultStrategy(new PushNotification());

        System.out.println("Creating subscribers:");

        Subscriber rakhman = facade.register(
                "Rakhman Seidigali",
                "242171@astanaitedu.kz",
                "+7-700-962-2073",
                new EmailNotification()
        );

        Subscriber alex = facade.register(
                "Alex Turner",
                "articmonkeys@email.com",
                "+1-234-445-566",
                new SMSNotification()
        );

        Subscriber kyzbolsyn = facade.register(
                "Kyzbolsyn Lexusovich",
                "kyzbolssynn234@email.kz",
                "+1-234-567-8899",
                new PushNotification()
        );

        Subscriber elon = facade.register(
                "Elon Musk",
                "technoking@tesla.com",
                "+1-420-690-0000",
                new PushNotification()
        );

        Subscriber shrek = facade.register(
                "Shrek Ogre",
                "shrek@swamp.com",
                "+44-777-123-0123",
                new SMSNotification()
        );

        Subscriber patrick = facade.register(
                "Patrick Star",
                "patrick@bikinibottom.sea",
                "+1-555-ROCK-HOME",
                new TeaserDecorator(new EmailNotification())
        );

        Subscriber trevor = facade.register(
                "Trevor Phillips",
                "trevor@gtamail.com",
                "+1-747-CHAOS-NOW",
                new DndDecorator(new PushNotification(), LocalTime.of(22, 0), LocalTime.of(8, 0))
        );
        facade.addInterest(rakhman, "Technology");
        facade.addInterest(rakhman, "Music");

        facade.addInterest(elon, "Technology");
        facade.addInterest(alex, "Music");

        facade.addInterest(patrick, "Entertainment");
        facade.addInterest(patrick, "Food");

        facade.addInterest(trevor, "Crime");
        facade.addInterest(shrek, "Entertainment");

        facade.addInterest(kyzbolsyn, "Entertainment");

        System.out.println("\nCreating articles:");
        facade.changeStrategy(rakhman, new PushNotification());

        ArticleFactory techArticle = new TechArticleFactory();
        facade.publish(techArticle,
                "IPhone 17 Released",
                "The latest iPhone 17 has been released with groundbreaking features that redefine mobile technology",
                "Apple"
        );

        ArticleFactory sportsArticle = new SportsArticleFactory();
        facade.publish(sportsArticle,
                "Kairat Wins Real Madrid",
                "In an exhilarating final match, Kairat won the UCL title, bringing joy to fans across the country.",
                "QazSport"
        );

        ArticleFactory musicArticle = new MusicArticleFactory();
        facade.publish(musicArticle,
                "New Album by Arctic Monkeys",
                "Arctic Monkeys have released their latest album, featuring a blend of classic and modern rock sounds.",
                "Alex Turner"
        );
        ArticleFactory CrimeArticle = new CrimeArticleFactory();
        facade.publish(CrimeArticle,
                "A man hijacked a helicopter",
                "Saying he just wanted to 'fly'",
                "Los Santos Police Department"
        );
        ArticleFactory entertainmentArticle = new EntertainmentArticleFactory();
        facade.publish(entertainmentArticle,
                "Shrek 5 Announced",
                "DreamWorks has officially announced the production of Shrek 5, promising more adventures in the swamp.",
                "DreamWorks Studios"
        );
        ArticleFactory foodArticle = new FoodArticleFactory();
        facade.publish(foodArticle,
                "Top 10 Street Foods in Asia",
                "Explore the vibrant street food scenes across Asia with our top 10 must-try dishes",
                "Gourmet Traveler"
        );
        ArticleFactory politicsArticle = new PoliticsArticleFactory();
        facade.publish(politicsArticle,
                "Leaders of G7 Meet to Discuss Global Issues",
                "The G7 summit brought together leaders from the world's major economies to address pressing global challenges",
                "Global News Network"
        );
        ArticleFactory weatherArticle = new WeatherArticleFactory();
        facade.publish(weatherArticle,
                "Cold wave coming to Astana",
                "Qazhydromet says a cold wave is expected to hit Astana next week with temperatures dropping to -15C",
                "Qazhydromet"
        );
    }

}
