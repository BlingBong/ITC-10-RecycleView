package com.example.spookbook;

import java.util.ArrayList;

public class BookData {

    private static String title[] = {
            "Dracula",

            "Frankenstein",

            "IT",

            "Hell House",

            "World War Z",

            "The Exorcist",

            "Rosemary's Baby",

            "The Call of Cthulhu",

            "House of Leaves",

            "Heart-Shaped Box"
    };

    private static String author[] = {
            "Bram Stroker",

            "Mary Shelley",

            "Stephen King",

            "Richard Matheson",

            "Max Brooks",

            "William Peter Blatty",

            "Ira Levin",

            "H.P. Lovecraft",

            "Mark Z. Danielewski",

            "Joe Hill"
    };

    private static String description[] = {
            "\t\tDracula is an 1897 Gothic horror novel by Irish author Bram Stoker. It introduced the character of Count Dracula and established many conventions of subsequent vampire fantasy.[1] The novel tells the story of Dracula's attempt to move from Transylvania to England so that he may find new blood and spread the undead curse, and of the battle between Dracula and a small group of people led by Professor Abraham Van Helsing.\n" +
                    "\n" +
                    "\t\tDracula has been assigned to many literary genres including vampire literature, horror fiction, gothic fiction, and invasion literature. The novel has spawned numerous theatrical, film, and television interpretations.",

            "\t\tFrankenstein; or, The Modern Prometheus is an 1818 novel written by English author Mary Shelley (1797–1851) that tells the story of Victor Frankenstein, a young scientist who creates a hideous sapient creature in an unorthodox scientific experiment. Shelley started writing the story when she was 18, and the first edition was published anonymously in London on 1 January 1818, when she was 20.[2] Her name first appeared in the second edition published in Paris in 1821.\n" +
                    "\n" +
                    "\t\tShelley travelled through Europe in 1815 along the river Rhine in Germany stopping in Gernsheim, 17 kilometres (11 mi) away from Frankenstein Castle, where two centuries before, an alchemist engaged in experiments.[3][4][5] She then journeyed to the region of Geneva, Switzerland, where much of the story takes place. The topics of galvanism and occult ideas were themes of conversation among her companions, particularly her lover and future husband Percy B. Shelley. Mary, Percy and Lord Byron had a competition to see who could write the best horror story. After thinking for days, Shelley dreamt about a scientist who created life and was horrified by what he had made, inspiring the novel.[6]\n" +
                    "\n" +
                    "\t\tThough Frankenstein is infused with elements of the Gothic novel and the Romantic movement, Brian Aldiss has argued that it should be considered the first true science fiction story. In contrast to previous stories with fantastical elements resembling those of later science fiction, Aldiss states the central character \"makes a deliberate decision\" and \"turns to modern experiments in the laboratory\" to achieve fantastic results.[7] It has had a considerable influence in literature and popular culture and spawned a complete genre of horror stories, films and plays.",

            "\t\tIt is a 1986 horror novel by American author Stephen King. It was his 22nd book, and his 17th novel written under his own name. The story follows the experiences of seven children as they are terrorized by an evil entity that exploits the fears of its victims to disguise itself while hunting its prey. \"It\" primarily appears in the form of Pennywise the Dancing Clown to attract its preferred prey of young children.\n" +
                    "\n" +
                    "\t\tThe novel is told through narratives alternating between two periods and is largely told in the third-person omniscient mode. It deals with themes that eventually became King staples: the power of memory, childhood trauma and its recurrent echoes in adulthood, and overcoming evil through mutual trust and sacrifice.\n" +
                    "\n" +
                    "\t\tKing has stated that he first conceived the story in 1978, and began writing it in 1981. He finished writing the book in 1985.[2] He also stated that he originally wanted the title character to be a troll like the one in the children's story \"Three Billy Goats Gruff\", but who inhabited the local sewer system rather than just the area beneath one bridge. He also wanted the story to interweave the stories of children and the adults they later become.\n" +
                    "\n" +
                    "\t\tThe novel won the British Fantasy Award in 1987, and received nominations for the Locus and World Fantasy Awards that same year.[3] Publishers Weekly listed It as the best-selling hardcover fiction book in the United States in 1986.[4] It has been adapted into a 1990 two-part miniseries directed by Tommy Lee Wallace, a Hindi 1998 television series directed by Glen Baretto & Ankush Mohla, and into a film duology directed by Andy Muschietti; It was released in September 2017 and It Chapter Two was released in September 2019.",

            "\t\tThe story of Hell House concerns four people – Dr. Lionel Barrett, a physicist with an interest in parapsychology, his wife Edith, and two mediums (Florence Tanner, a spiritualist and mental medium, and Benjamin Franklin Fischer, a physical medium who had been to the haunted house 30 years earlier.). Barrett, Tanner, and Fischer are hired by dying millionaire, William Reinhardt Deutsch, to investigate the possibility of life after death and to solve with a time limit of one week. To do so, they must enter the infamous Belasco House in Maine, regarded as the most haunted house in the world. The house is called \"Hell House\" due to the horrible acts of blasphemy and perversion that occurred there under the silent influence and supervision of Emeric Belasco. Meanwhile, there are other mysteries to be found in Hell House, such as the supposed murder of Emeric Belasco's son, Daniel Myron Belasco, and the puzzle as to why a majority of people who enter the home are dead by the end of their visit.\n" +
                    "\n" +
                    "\t\tThe novel combines supernatural horror with mystery as the researchers attempt to investigate the haunting of the house while their sanity subtly is undermined by its sinister supernatural influence. The home exploits its guests' deepest desires and attempts to turn people against one another during the course of their visit.\n" +
                    "\n" +
                    "\t\tDuring the investigation, various influences begin to affect each character's personal weaknesses: Florence through her belief in spiritualism and her over-eagerness to rid the house of its evil; Dr. Barrett through his almost-arrogant disbelief in/disregard for spiritualism, his debilitated physical condition (having suffered from polio when young), and his belief in science and the power of the Reversor machine he has built to rid the house of its haunting; Edith through her personal fears, insecurities, and pent-up sexual desires; and Fischer through his deliberate inaction (which he calls \"caution\"). Hell House's potency comes from its apparent ability to corrupt those who enter its walls, before bringing about their destruction, both mental and physical.",

            "\t\tWorld War Z: An Oral History of the Zombie War is a 2006 zombie apocalyptic horror novel written by American author Max Brooks. The novel is a collection of individual accounts narrated by an agent of the United Nations Postwar Commission, following the devastating global conflict against the zombie plague. Other passages record a decade-long desperate struggle, as experienced by people of various nationalities. The personal accounts also describe the resulting social, political, religious, economic, and environmental changes.\n" +
                    "\n" +
                    "\t\tWorld War Z is a follow-up to Brooks' fictitious survival manual The Zombie Survival Guide (2003), but its tone is much more serious. It was inspired by The Good War: An Oral History of World War Two (1984) by Studs Terkel, and by the zombie films of George A. Romero (1968–2009). Brooks used World War Z to comment on government ineptitude and US isolationism, while also examining survivalism and uncertainty. The novel was a commercial hit and was praised by most critics.\n" +
                    "\n" +
                    "\t\tIts 2007 audiobook version, performed by a full cast including Alan Alda, Mark Hamill, and John Turturro, won an Audie Award. A film adaptation, directed by Marc Forster and starring Brad Pitt, was released in 2013, and a video game of the same name, based on the 2013 film, was released in 2019 by Saber Interactive.",

            "\t\tThe Exorcist is a 1971 horror novel by American writer William Peter Blatty. The book details the demonic possession of eleven-year-old Regan MacNeil, the daughter of a famous actress, and the two priests who attempt to exorcise the demon. Published by Harper & Row, the novel was the basis of a highly successful film adaption released two years later, whose screenplay was also written and produced by Blatty, and part of The Exorcist franchise.\n" +
                    "\n" +
                    "\t\tThe novel was inspired by a 1949 case of demonic possession and exorcism that Blatty heard about while he was a student in the class of 1950 at Georgetown University.[1] As a result, the novel takes place in Washington, D.C., near the campus of Georgetown University. In September 2011, the novel was reprinted by Harper Collins to celebrate its fortieth anniversary, with slight revisions made by Blatty as well as interior title artwork by Jeremy Caniglia.",

            "\t\tThe book centers on Rosemary Woodhouse, a young married woman who has just moved into the Bramford, an historic Gothic Revival-style New York City apartment building, with her husband, Guy, a struggling actor. Guy had so far appeared only in small roles in the stage plays Luther, Nobody Loves an Albatross, and various TV commercials. The pair is warned that the Bramford has a disturbing history involving witchcraft and murder, but they choose to overlook this. For some time Rosemary has wanted children, but Guy wants them to wait until his career is more established.\n" +
                    "\n" +
                    "\t\tRosemary and Guy are quickly welcomed to the Bramford by neighbors Minnie and Roman Castevet, an eccentric elderly couple. Rosemary finds them meddlesome and absurd, but Guy begins paying them frequent visits.\n" +
                    "\n" +
                    "\t\tAfter a theatrical rival suddenly goes blind, Guy is given an important part in a stage play. Immediately afterward, Guy unexpectedly agrees with Rosemary that it is time to conceive their first child. That night, she dreams of a rough sexual encounter with a huge, inhuman creature with yellow eyes. Rosemary finds claw marks on her breasts and groin the following morning, which Guy dismisses as the results of a hangnail. She subsequently learns that she is pregnant.\n" +
                    "\n" +
                    "\t\tRosemary falls severely ill; but her severe pain and weight loss are ignored by everyone around her and attributed to hysteria. Her doctor and Minnie feed her strange and foul concoctions. Rosemary also develops a peculiar craving for raw meat.\n" +
                    "\n" +
                    "\t\tGuy's performance in the stage play brings him favorable notices, and he gains other, increasingly important roles. He soon begins to talk about a career in Hollywood.\n" +
                    "\n" +
                    "\t\tAfter receiving a warning from a friend, Edward \"Hutch\" Hutchins, who also becomes mysteriously ill, Rosemary discovers that her neighbors are the leaders of a Satanic coven. She suspects that they intend to steal her baby and use it as a sacrifice to the devil. Despite her growing conviction, she is unable to convince anyone else. She comes to believe that she has no one on her side, least of all her own husband. Ultimately, Rosemary finds that she is wrong about the coven's reason for wanting the baby. The baby that she has delivered is the Antichrist, and Guy is not the father; Satan is.",

            "\t\tThe Call of Cthulhu is Penguin Classics' first omnibus edition of works by seminal 20th-century American author H. P. Lovecraft. It was released in October 1999 and is still in print. The volume is named for the Lovecraft short story, \"The Call of Cthulhu\".\n" +
                    "\n" +
                    "\t\tThis edition, the first new paperback publication of Lovecraft's works since the Del-Rey editions, contains a new introduction and explanatory notes on individual stories by noted Lovecraft scholar S. T. Joshi. The texts of the stories are, for the most part, the same corrected versions found in the earlier Arkham House editions of Lovecraft's works, also edited by Joshi, with a few further errors corrected for the present editions.\n" +
                    "\n" +
                    "\t\tIts companion volumes from Penguin Classics are The Thing on the Doorstep and Other Weird Stories (2001), and The Dreams in the Witch House and Other Weird Stories (2004).",

            "\t\tHouse of Leaves is the debut novel by American author Mark Z. Danielewski, published in March 2000 by Pantheon Books. A bestseller, it has been translated into a number of languages, and is followed by a companion piece, The Whalestoe Letters.\n" +
                    "\n" +
                    "\t\tThe plot is centered on a (possibly fictional) documentary about a family whose house is impossibly larger on the inside than the outside. The format and structure of House of Leaves is unconventional, with unusual page layout and style, making it a prime example of ergodic literature.[1][2] It contains copious footnotes, many of which contain footnotes themselves, including references to fictional books, films or articles.[3] In contrast, some pages contain only a few words or lines of text, arranged in strange ways to mirror the events in the story, often creating both an agoraphobic and a claustrophobic effect. At points, the book must be rotated to be read. The novel is also distinctive for its multiple narrators, who interact with each other in elaborate and disorienting ways.\n" +
                    "\n" +
                    "\t\tWhile some have attempted to describe the book as a horror story, many readers, as well as the author, define the book as a love story. Danielewski expands on this point in an interview: \"I had one woman come up to me in a bookstore and say, 'You know, everyone told me it was a horror book, but when I finished it, I realized that it was a love story.' And she's absolutely right. In some ways, genre is a marketing tool.\"[4] House of Leaves has also been described as a \"satire of academic criticism.\"[5]",

            "\t\tAging rock star Judas Coyne spends his retirement collecting morbid memorabilia, including a witch's confession, a real snuff film and, after being sent an email directly about the item online, a dead man's funeral suit. Jude is informed by Jessica Price, the dead man's daughter, that the old man's spirit is attached to the suit, such that Jude is effectively buying himself a ghost. Jude cannot pass up this creepy opportunity.\n" +
                    "\n" +
                    "\t\tThe suit arrives in a heart-shaped box. Various odd occurrences cause Jude to realize that the ghost is deadly and is out to kill him and those around him. His assistant, Danny Wooten, kills himself, but not before contacting the woman who sent the suit. Jude finds out that the ghost was the stepfather of a groupie, Florida, whom Jude lived with for a few months and who had later committed suicide. The ghost holds Jude responsible for Florida's death and wants revenge. Jude flees his house with his current girlfriend, Georgia, with the ghost in hot pursuit.\n" +
                    "\n" +
                    "\t\tThe ghost's intent is to separate Jude from his two dogs, Angus and Bon, who, as familiars, can protect their owners from the dead. Jude and Georgia take the dogs with them while fleeing south. The dogs save them several times, but the ghost eventually kills them. Jude and Georgia discover that Florida had been hypnotized and molested by her stepfather, Craddock McDermott. When Florida threatened to turn in Craddock and her elder sister Jessica to the police, they killed her and staged her death as a suicide. Later, a dying Craddock hexed the suit and arranged for Jessica to sell it to Jude.\n" +
                    "\n" +
                    "\t\tAfter a series of gory battles between Jude and Craddock, Georgia finds a way to contact Florida beyond the grave for help fighting her stepfather's ghost. In the end, Craddock is vanquished, freeing Jude and Georgia from his curse, and Jessica is sent to jail. After surviving the horrendous ordeal, Jude and Georgia eventually marry."
    };

    private static int image[] = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j
    };

    public static ArrayList<DataSetGet> getData() {
        ArrayList<DataSetGet> list = new ArrayList<>();
        for (int position = 0; position < title.length; position++) {
            DataSetGet data = new DataSetGet();
            data.setTitle(title[position]);
            data.setAuthor(author[position]);
            data.setDescription(description[position]);
            data.setImage(image[position]);
            list.add(data);
        }
        return list;
    }
}
