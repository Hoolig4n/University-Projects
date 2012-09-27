#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
	cout <<"           ********************************************************        " << endl;
    cout <<"           *               Darlene's Data Collector               *" << endl;
	cout <<"           ********************************************************" << endl;

	string fileName;
	ofstream inFile;

	cout <<"What File to Analyze Darlene? ";
	getline(cin, fileName);
	cout << endl;

	inFile.open(fileName.c_str());

	if(!inFile)
		cout << "Opening File" << fileName << " has Failed!" << endl;
	else
		cout << fileName << " has been opened Successfully!" << endl;
}

