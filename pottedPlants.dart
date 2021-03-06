import 'package:flutter/material.dart';

final Color amber = Color(0xFFFFC107);

void main() => runApp(MyApp());

///main application widget.
class MyApp extends StatelessWidget {
  static const String _title = 'Flutter Code';
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData.dark().copyWith(scaffoldBackgroundColor: amber),
      title: _title,
      home: MyStatelessWidget(),
    );
  }
}

//second page
final GlobalKey<ScaffoldState> scaffoldKey = GlobalKey<ScaffoldState>();
final SnackBar snackBar = const SnackBar(content: Text('Lower Pop-Up Icon'));

void openPage(BuildContext context) {
  Navigator.push(context, MaterialPageRoute(
    builder: (BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title: const Text('Previous page'),
        ),
        body: const Center(
          child: Text(
            'Favorite Genre of Music:',
            style: TextStyle(fontSize: 25),
          ),
        ),
      );
    },
  ));
}

//first page
class MyStatelessWidget extends StatelessWidget {
  MyStatelessWidget({Key key}) : super(key: key);

  Widget build(BuildContext context) {
    return Scaffold(
      key: scaffoldKey,
      appBar: AppBar(
        title: const Text('Potted Tunes'),
        actions: <Widget>[
          IconButton(
            icon: const Icon(Icons.add_alert),
            tooltip: 'Lower Pop-Up Icon',
            onPressed: () {
              scaffoldKey.currentState.showSnackBar(snackBar);
            },
          ),
          IconButton(
            icon: const Icon(Icons.navigate_next),
            tooltip: 'Next page',
            onPressed: () {
              openPage(context);
            },
          ),
        ],
      ),
      body: const Center(
        child: Text(
          'Music Questionnaire!',
          style: TextStyle(fontSize: 45),
        ),
      ),
    );
  }
}
