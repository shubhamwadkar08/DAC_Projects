import React from 'react';
import '../components/Footer.css';

function Footer() {
  const year = new Date().getFullYear();

  return (
    <footer>
      <p>&copy; {year} The BlogMinton. All rights reserved to CDAC.</p>
    </footer>
  );
}

export default Footer;