/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molemap;

/**
 *
 * @author hickey705
 */
public class PeriodTable
{

    private Elements[] table;

    public PeriodTable()
    {
        
        table = new Elements[119];
        table[1] = new Elements(1.00794, 1, "Hydrogen");
        table[2] = new Elements(4.0026, 2, "Helium");
        table[3] = new Elements(6.941, 3, "Lithium");
        table[4] = new Elements(9.0122, 4, "Beryllium");
        table[5] = new Elements(10.811, 5, "Boron");
        table[6] = new Elements(12.0107, 6, "Carbon");
        table[7] = new Elements(14.0067, 8, "Nitrogen");
        table[8] = new Elements(15.9994, 8, "Oxygen");
        table[9] = new Elements(18.9984, 9, "Flourine");
        table[10] = new Elements(20.1797, 10, "Neon");
        table[11] = new Elements(22.9897, 11, "Sodium");
        table[12] = new Elements(24.305, 12, "Magnesium");
        table[13] = new Elements(26.9851, 13, "Aluminum");
        table[14] = new Elements(28.0855, 14, "Silicon");
        table[15] = new Elements(30.9738, 15, "Phosphorus");
        table[16] = new Elements(32.065, 16, "Sulfer");
        table[17] = new Elements(35.453, 17, "Chlorine");
        table[18] = new Elements(39.948, 18, "Argon");
        table[19] = new Elements(39.0983, 19, "Potassium");
        table[20] = new Elements(40.078, 20, "Calcium");
        table[21] = new Elements(44.9559, 21, "Scandium");
        table[22] = new Elements(47.867, 22, "Titanium");
        table[23] = new Elements(50.9415, 23, "Vanadium");
        table[24] = new Elements(51.9961, 24, "Chromium");
        table[25] = new Elements(54.938, 25, "Manganese");
        table[26] = new Elements(55.845, 26, "Iron");
        table[27] = new Elements(58.9332, 27, "Cobalt");
        table[28] = new Elements(58.6934, 28, "Nickel");
        table[29] = new Elements(63.546, 29, "Copper");
        table[30] = new Elements(65.39, 30, "Zinc");
        table[31] = new Elements(69.723, 31, "Gallium");
        table[32] = new Elements(72.64, 32, "Germanium");
        table[33] = new Elements(74.9216, 33, "Arsenic");
        table[34] = new Elements(78.96, 34, "Selenium");
        table[35] = new Elements(79.904, 35, "Bromine");
        table[36] = new Elements(83.8, 36, "Krypton");
        table[37] = new Elements(85.4678, 37, "Rubidium");
        table[38] = new Elements(87.62, 38, "Strontium");
        table[39] = new Elements(88.9059, 39, "Yttrium");
        table[40] = new Elements(91.224, 40, "Zirconium");
        table[41] = new Elements(92.9064, 41, "Niobium");
        table[42] = new Elements(95.94, 42, "Molybdenum");
        table[43] = new Elements(98, 43, "Technetium");
        table[44] = new Elements(101.07, 44, "Ruthenium");
        table[45] = new Elements(102.9055, 45, "Rhodium");
        table[46] = new Elements(106.42, 46, "Palladium");
        table[47] = new Elements(107.8682, 47, "Silver");
        table[48] = new Elements(112.411, 48, "Cadmium");
        table[49] = new Elements(114.818, 49, "Indium");
        table[50] = new Elements(118.71, 50, "Tin");
        table[51] = new Elements(121.76, 51, "Antimony");
        table[52] = new Elements(127.6, 52, "Tellurium");
        table[53] = new Elements(126.9045, 53, "Iodine");
        table[54] = new Elements(131.293, 54, "Xenon");
        table[55] = new Elements(132.9055, 55, "Cesium");
        table[56] = new Elements(137.327, 56, "Barium");
        table[57] = new Elements(138.9055, 57, "Lanthanum");
        table[58] = new Elements(140.116, 58, "Cerium");
        table[59] = new Elements(140.9077, 59, "Praseodymium");
        table[60] = new Elements(144.24, 60, "Neodymium");
        table[61] = new Elements(145, 61, "Promethium");
        table[62] = new Elements(150.36, 62, "Samarium");
        table[63] = new Elements(151.964, 63, "Europian");
        table[64] = new Elements(157.25, 64, "Gadolinium");
        table[65] = new Elements(158.9253, 65, "Terbium");
        table[66] = new Elements(162.5, 66, "Dysprosium");
        table[67] = new Elements(164.9303, 67, "Holmium");
        table[68] = new Elements(167.259, 68, "Erbium");
        table[69] = new Elements(168.9342, 69, "Thulium");
        table[70] = new Elements(173.04, 70, "Ytterbium");
        table[71] = new Elements(174.967, 71, "Lutetium");
        table[72] = new Elements(178.49, 72, "Hafnium");
        table[73] = new Elements(180.9479, 73, "Tantalum");
        table[74] = new Elements(183.84, 74, "Tungsten");
        table[75] = new Elements(186.207, 75, "Rhenium");
        table[76] = new Elements(190.23, 76, "Osmium");
        table[77] = new Elements(192.217, 77, "Iridium");
        table[78] = new Elements(195.078, 78, "Platinum");
        table[79] = new Elements(196.9665, 79, "Gold");
        table[80] = new Elements(200.59, 80, "Mercury");
        table[81] = new Elements(204.3833, 81, "Thallium");
        table[82] = new Elements(207.2, 82, "Lead");
        table[83] = new Elements(208.9804, 83, "Bismuth");
        table[84] = new Elements(209, 84, "Polonium");
        table[85] = new Elements(210, 85, "Astatine");
        table[86] = new Elements(222, 86, "Radon");
        table[87] = new Elements(223, 87, "Francium");
        table[88] = new Elements(226, 88, "Radium");
        table[89] = new Elements(227, 89, "Actinium");
        table[90] = new Elements(232.0381, 90, "Thorium");
        table[91] = new Elements(231.0359, 91, "Protactinium");
        table[92] = new Elements(238.0289, 92, "Uranium");
        table[93] = new Elements(237, 93, "Neptunium");
        table[94] = new Elements(244, 94, "Plutonium");
        table[95] = new Elements(243, 95, "Americium");
        table[96] = new Elements(247, 96, "Curium");
        table[97] = new Elements(247, 97, "Berkelium");
        table[98] = new Elements(251, 98, "Californium");
        table[99] = new Elements(252, 99, "Einsteinium");
        table[100] = new Elements(257, 100, "Ferminium");
        table[101] = new Elements(258, 101, "Mendelevium");
        table[102] = new Elements(259, 102, "Nobelium");
        table[103] = new Elements(262, 103, "Lawrencium");
        table[104] = new Elements(261, 104, "Rutherfordium");
        table[105] = new Elements(262, 105, "Dubnium");
        table[106] = new Elements(266, 106, "Seaborgium");
        table[107] = new Elements(264, 107, "Bohrium");
        table[108] = new Elements(277, 108, "Hassium");
        table[109] = new Elements(268, 109, "Meitnerium");
        table[110] = new Elements(0.000, 110, "Darmstadtium");
        table[111] = new Elements(272, 111, "Roentgenium");
        table[112] = new Elements(0.000, 112, "Ununbium");
        table[113] = new Elements(0.000, 113, "Ununtrium");
        table[114] = new Elements(0.000, 114, "Ununquadium");
        table[115] = new Elements(0.000, 115, "Ununpentium");
        table[116] = new Elements(0.000, 116, "Ununhexium");
        table[117] = new Elements(0.000, 117, "Ununseptium");
        table[118] = new Elements(0.000, 118, "Ununoctium");
    }

    public Elements getElement(int i)
    {
        return table[i];
    }
}
