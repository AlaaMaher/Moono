package myapplication.sairamkrishna.example.com.moono.Options.LearnAndEarn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import myapplication.sairamkrishna.example.com.moono.R;
import myapplication.sairamkrishna.example.com.moono.adapter.ApolloAdapter;

public class ApolloMissions extends AppCompatActivity {

    String [] titles = {"Apollo 11 ", "Apollo 12 ", "Apollo 13 ", "Apollo 14","Apollo 15", "Apollo 16","Apollo 17"};
    Integer [] images = {R.drawable.apollo11,R.drawable.apollo12,R.drawable.apollo13,R.drawable.apollo14,R.drawable.apollo15,R.drawable.apollo16,R.drawable.apollo17};
   public  String [] content  ={
            "Launch date: 16 July 1969. Return date: 24 July 1969.\n" +
                    "Apollo 11 was the first manned mission to land on the Moon. The objective was to land a\n" +
                    "man on the Moon and return safely to Earth.\n" +
                    "After a four-day trip from Earth, the first crewed flight to the lunar surface touched down in\n" +
                    "Mare Tranquilitatis, a relatively smooth and level area. The lunar lander Eaglewas piloted\n" +
                    "manually in the last seconds before landing to avoid a field of boulders and a large crater.\n" +
                    "\"Houston, Tranquility Base here. The Eagle has landed.” These words marked a new era of\n" +
                    "human exploration, and paved the way for the Apollo lunar landing missions to follow. The\n" +
                    "first humans to walk on another planetary body were Neil Armstrong and Buzz Aldrin. Neil\n" +
                    "emerged from the spacecraft first. While descending from the lander, he released a surface\n" +
                    "television camera that recorded humankind's first step on the Moon. The footage was\n" +
                    "broadcast to a worldwide audience, and half a billion people watched the event live on\n" +
                    "television. The astronauts collected samples, set up experiments to be left on the Moon and\n" +
                    "examined the area. The scientific activities were completed in two and a half hours.\n" +
                    "Apollo 11 carried the first geologic samples from the Moon back to Earth. The astronauts\n" +
                    "collected 22 kilograms of material, including 50 rocks, fine-grained lunar soil and two tubes\n" +
                    "of material from up to 13 cm below the Moon’s surface.\n" +
                    "The mission effectively ended the ‘Space Race’ between USA and USSR, fulfilling the\n" +
                    "national goal promised in 1961 by US President John F. Kennedy: to land a man on the Moon\n" +
                    "and return him safely to the Earth before the decade was out.",
                     "Launch date: 14 November 1969. Return date: 24 November 1969.\n" +
                    "Apollo 12, the second manned mission to land on the Moon, executed a precision landing,\n" +
                    "touching down within walking distance of the unmanned Surveyor 3 spacecraft. The\n" +
                    "astronauts brought some of Surveyor's parts back to Earth to analyse the impact of long-term\n" +
                    "exposure to the lunar environment on spacecraft hardware.\n" +
                    "The Saturn V rocket carrying Apollo 12 was struck by lightning after launch, momentarily\n" +
                    "shutting off electrical power and breaking telemetry contact. Power was automatically\n" +
                    "switched to battery backup while the astronauts restored the primary power system.\n" +
                    "The second lunar landing was an exercise in precision targeting. Most of the descent was\n" +
                    "automatic with manual control only necessary during the final metres of descent. The\n" +
                    "astronauts landed on Oceanus Procellarum where several unmanned missions had landed\n" +
                    "already (Luna 5, Surveyor 3 and Ranger 7). This precision landing was of great significance\n" +
                    "to the future exploration programme, because it increased confidence in landing at specific\n" +
                    "areas of scientific interest. Alan Bean and Charles Conrad deployed the Apollo Lunar Surface\n" +
                    "Experiments Package, or ALSEP, to gather seismic, scientific and engineering data. During\n" +
                    "their sorties, the astronauts documented and collected lunar samples covering an area of\n" +
                    "around 1300 m. The Apollo 12 samples were mostly basalts.\n" +
                    "Surveyor 3 had soft-landed on the inner slope of a crater 31 months before the Apollo 12\n" +
                    "mission. The astronauts retrieved several pieces of the probe, including the video camera and\n" +
                    "electrical cables, its sample scoop and two pieces of aluminium tubing.",
            "Launch date: 11 April 1970. Return date: 17 April 1970.\n" +
                    "Apollo 13 was to be the third mission to land on the Moon, but it was aborted after an\n" +
                    "explosion in one of the service module's oxygen tanks that endangered the whole flight. It\n" +
                    "was classified as a \"successful failure\" because the crew was rescued and much experience\n" +
                    "was gained.\n" +
                    "During its first two days, the Apollo 13 mission was looking like a smooth flight to the\n" +
                    "Moon. The mission was aborted after nearly 56 hours when one of the oxygen tanks blew up.\n" +
                    "The command module’s normal supply of electricity, light and water was lost. The crew was\n" +
                    "about 320 000 km away from Earth.\n" +
                    "As all Apollo landing missions, the Apollo 13 spacecraft consisted of a Command Module,\n" +
                    "Service Module and Lunar Module. As a result of the accident, none of these components\n" +
                    "was used in the way they were intended. The Lunar Module was designed to land on the\n" +
                    "Moon, but acted as a lifeboat for this mission. With its separate systems for power and\n" +
                    "consumables, it allowed the crew to preserve the Command Module's supplies for reentry. Its\n" +
                    "descent engine was used to manoeuvre the spacecraft to return to Earth.\n" +
                    "Ground controllers faced a formidable task. New procedures had to be written and tested in a\n" +
                    "simulator before being passed to the crew. Following mission control instructions, the\n" +
                    "astronauts built an adapter for the Command Module cartridges to accept hoses on the Lunar\n" +
                    "Module. The crew circled the Moon without landing, and the upper stage was crashed into\n" +
                    "the lunar surface. The powered-down Command Module required new procedures to be\n" +
                    "invented for entry. After a nearly catastrophic flight, the Apollo 13 spacecraft splashed down\n" +
                    "safely in the Pacific Ocean.",
            "Launch date: 31 January 1971. Return date: 9 February 1971.\n" +
                    "After Apollo 13, the Apollo 14 spacecraft was modified for safety, including a redesign of the\n" +
                    "oxygen tanks as well as improvements to support more operations on the Moon.\n" +
                    "In the most precise landing to date, Apollo 14 touched down in the Fra Mauro region, where\n" +
                    "Apollo 13 was supposed to land before its aborted mission. This region was formed by\n" +
                    "material ejected from the impact that formed the Imbrium Basin. The mission's primary\n" +
                    "objective was to sample material from the impact area.\n" +
                    "The astronauts deployed 14 instruments from the Apollo Lunar Surface Scientific\n" +
                    "Experiments Package, or ALSEP. They also set the solar wind composition experiment,\n" +
                    "erected an S-band antenna and a laser ranging retroreflector. The Apollo 14 astronauts used a\n" +
                    "Modularized Equipment Transporter (MET) to haul equipment during their moonwalks. It\n" +
                    "was a portable workbench with a place for tools, cameras, sample containers and a shaft to\n" +
                    "take measurements of how easily the lunar surface could be penetrated. The astronauts\n" +
                    "almost walked to the rim of nearby Cone crater, collecting samples along the way and taking\n" +
                    "photographs. From the Command Module orbiting the Moon, astronaut Edgar Mitchell ran\n" +
                    "orbital science experiments such as high-resolution photography of potential landing sites\n" +
                    "and deep-space phenomena as well as running communications tests.\n" +
                    "The command module splashed down safely in the Pacific Ocean, exactly nine days and two\n" +
                    "minutes after launch.",
            "Launch date: 26 July 1971. Return date: 7 August 1971.\n" +
                    "Apollo 15 marked a new series of missions, the so called J missions, each capable of longer\n" +
                    "stays on the Moon and exploring more lunar terrain. For the first time, astronauts drove a\n" +
                    "lunar rover. The mission had a great focus on science.\n" +
                    "The objectives were to explore a new region, set up and activate lunar surface scientific\n" +
                    "experiments, test new equipment, and conduct lunar orbital experiments and photographic\n" +
                    "tasks. The landing site for Apollo 15 was on the eastern margin of the Imbrium Basin. The\n" +
                    "region offered the opportunity to sample both the rim of the basin and the Apennine\n" +
                    "mountains to the east as well as to explore the Hadley Rille region, a channel that was\n" +
                    "probably formed by volcanic processes, to the west. The spacecraft was modified to run more\n" +
                    "orbital science activities than any previous mission.\n" +
                    "The Lunar Roving Vehicle, a four-wheeled electric automobile, let the astronauts travel\n" +
                    "further than before. The vehicle was designed to carry two astronauts and science payloads at\n" +
                    "a maximum speed of 16 km/h. New spacesuits allowed the astronauts more flexibility to sit\n" +
                    "on the rover and upgraded backpacks gave them autonomy for longer moonwalks. David\n" +
                    "Scott and Jim Irwin covered nearly 30 km of lunar terrain and collected 76 kg of lunar\n" +
                    "material from low dark plains and from a narrow winding valley. Among the samples one is\n" +
                    "now commonly known as the ‘Genesis Rock’, a piece of old lunar crust formed at least 4\n" +
                    "billion years ago that offers clues to the Moon’s geologic history.\n" +
                    "After spending nearly three days on the Moon, of which about 19 hours were spent outside\n" +
                    "the Lunar Module, Jim and David joined their colleague Al Worden in lunar orbit. The crew\n" +
                    "deployed a lunar sub-satellite designed to investigate the Moon's mass and gravitational\n" +
                    "variations, particle composition and the interaction of the Moon's magnetic field with Earth's.\n" +
                    "Worden made the first spacewalk in deep space to retrieve a camera film-cartridge outside\n" +
                    "the Command Module.",
            "Launch date: 16 April 1972. Return date: 27 April 1972.\n" +
                    "Apollo 16 was the tenth manned mission in the US Apollo space programme, and the first to\n" +
                    "land in the lunar highlands. Astronauts collected samples, took photographs and conducted\n" +
                    "experiments that included the first use of an ultraviolet camera on the Moon.\n" +
                    "Because the Apollo programme was about to finish – the last mission on the Moon would be\n" +
                    "Apollo 17 – there was no new hardware or procedures to test on the lunar surface. These two\n" +
                    "missions were used to better understand the Moon’s properties. The Apollo 16 spacecraft was\n" +
                    "modified to carry out a greater range of science activities and to increase the stay on the\n" +
                    "surface.\n" +
                    "The main objective of the mission was to investigate the lunar surface in the Descartes\n" +
                    "highlands. This site was selected as an ideal location for sampling geological units believed\n" +
                    "to be volcanic in origin. The samples collected by the astronauts were angular rocks called\n" +
                    "breccias. The rocks gave the scientific community detailed information about how impacts,\n" +
                    "rather than volcanoes, had shaped the central highlands. An ultraviolet camera returned\n" +
                    "photography of Earth and celestial regions in spectral bands not seen from our planet. The\n" +
                    "lunar rover was put to the test by conducting a series of S-turns, hairpin turns and hard stops.\n" +
                    "After astronauts John Young and Charles Duke rejoined Thomas Mattingly in lunar orbit, the\n" +
                    "crew released a small satellite from the Service Module. The satellite measured charged\n" +
                    "particles and magnetic fields around the Moon as it orbited Earth.",
            "Launch date: 7 December 1972. Return date: 19 December 1972.\n" +
                    "Apollo 17 was the last Apollo mission to land men on the Moon. NASA astronauts traversed\n" +
                    "the greatest distance using the Lunar Roving Vehicle (30 km) and returned the greatest\n" +
                    "amount of rock and soil samples (110 kg).\n" +
                    "The mission carried the only trained geologist to walk on the lunar surface, Harrison Schmitt.\n" +
                    "Eugene Cernan, commander of Apollo 17, still holds the distinction of being the last man to\n" +
                    "walk on the Moon. While Eugene and Harrison were exploring the lunar surface, Ronald\n" +
                    "Evans conducted many scientific activities in the service module, spending the longest time\n" +
                    "ever in lunar orbit. The Taurus-Littrow landing site offered a combination of mountainous\n" +
                    "highlands and valley lowlands from which to sample older and younger rocks than on\n" +
                    "previous missions. One of the goals for Apollo 17 was to investigate the geological\n" +
                    "relationship between the samples and the possibility of volcanic activity. Scientific objectives\n" +
                    "for the mission included geological surveying and sampling of materials and surface features,\n" +
                    "deploying surface experiments, conducting experiments and photographic tasks during lunar\n" +
                    "orbit and trans-Earth coast.\n" +
                    "The range of exploration and geological investigations was extended by the electric-powered\n" +
                    "lunar roving vehicle that carried tools, scientific equipment, communications gear and lunar\n" +
                    "samples. Three extravehicular activities, or EVAs, lasted a total of 22 hours."
    };

    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apollo_missions);

        ApolloAdapter apolloAdapter  = new ApolloAdapter(titles,images,this);
         listView = (ListView) findViewById(R.id.apollo_list);
        listView.setAdapter(apolloAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent  = new Intent(ApolloMissions.this, ApolloDetail.class);
                intent.putExtra("title",titles[position]);
                intent.putExtra("image",images[position]);
                intent.putExtra("content",content[position]);

                startActivity(intent);
            }
        });

    }
}
